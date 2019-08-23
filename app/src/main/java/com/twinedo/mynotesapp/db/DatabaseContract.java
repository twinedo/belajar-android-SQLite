package com.twinedo.mynotesapp.db;

import android.provider.BaseColumns;

public class DatabaseContract {

    static final class NoteColumns implements BaseColumns {
        static String TABLE_NAME = "note";
        static String TITLE = "title";
        static String DESCRIPTION = "description";
        static String DATE = "date";
    }
}
