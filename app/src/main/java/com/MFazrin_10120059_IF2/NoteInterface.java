package com.MFazrin_10120059_IF2;

import android.database.Cursor;

import com.MFazrin_10120059_IF2.model.Note;

/**
 * NAMA    : Muhammad Fazrin Ar-Rahman
 * NIM     : 10120059
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 * Pengganti UTS AKB
 */
public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
