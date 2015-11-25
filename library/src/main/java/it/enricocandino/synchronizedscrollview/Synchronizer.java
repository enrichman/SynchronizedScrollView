package it.enricocandino.synchronizedscrollview;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015 Enrico Candino
 * <p/>
 * Distributed under the MIT License.
 */
public class Synchronizer {

    private static Synchronizer instance;

    private List<Synchronizable> synchronizableList;
    private int mOffset;

    private Synchronizer() {
    }

    public static Synchronizer getInstance() {
        if (instance == null)
            instance = new Synchronizer();

        return instance;
    }

    public void register(Synchronizable synchronizable) {
        if (synchronizableList == null)
            synchronizableList = new ArrayList<>();

        synchronizable.onUpdate(mOffset);

        synchronizableList.add(synchronizable);
    }

    public void unregister(Synchronizable synchronizable) {
        if (synchronizableList != null)
            synchronizableList.remove(synchronizable);
    }

    public void update(Synchronizable sender, int update) {
        if (update < 0) update = 0;

        mOffset = update;

        for (Synchronizable s : synchronizableList) {
            if (s != sender)
                s.onUpdate(update);
        }
    }

    public interface Synchronizable {
        void onUpdate(int update);
    }

}
