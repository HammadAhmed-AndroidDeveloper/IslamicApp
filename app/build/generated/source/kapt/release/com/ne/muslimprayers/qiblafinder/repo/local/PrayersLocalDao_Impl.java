package com.ne.muslimprayers.qiblafinder.repo.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PrayersLocalDao_Impl implements PrayersLocalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocalDataPrayerAlarm> __insertionAdapterOfLocalDataPrayerAlarm;

  private final EntityDeletionOrUpdateAdapter<LocalDataPrayerAlarm> __updateAdapterOfLocalDataPrayerAlarm;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PrayersLocalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocalDataPrayerAlarm = new EntityInsertionAdapter<LocalDataPrayerAlarm>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `prayers` (`index`,`time`,`reminded`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocalDataPrayerAlarm value) {
        stmt.bindLong(1, value.getIndex());
        if (value.getTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTime());
        }
        final int _tmp = value.isReminded() ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
    this.__updateAdapterOfLocalDataPrayerAlarm = new EntityDeletionOrUpdateAdapter<LocalDataPrayerAlarm>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `prayers` SET `index` = ?,`time` = ?,`reminded` = ? WHERE `index` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocalDataPrayerAlarm value) {
        stmt.bindLong(1, value.getIndex());
        if (value.getTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTime());
        }
        final int _tmp = value.isReminded() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getIndex());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM prayers";
        return _query;
      }
    };
  }

  @Override
  public Object addPrayerReminder(final List<LocalDataPrayerAlarm> news,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLocalDataPrayerAlarm.insert(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateReminder(final LocalDataPrayerAlarm news,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfLocalDataPrayerAlarm.handle(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<LocalDataPrayerAlarm>> getPrayersReminder() {
    final String _sql = "SELECT * FROM prayers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"prayers"}, new Callable<List<LocalDataPrayerAlarm>>() {
      @Override
      public List<LocalDataPrayerAlarm> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIndex = CursorUtil.getColumnIndexOrThrow(_cursor, "index");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsReminded = CursorUtil.getColumnIndexOrThrow(_cursor, "reminded");
          final List<LocalDataPrayerAlarm> _result = new ArrayList<LocalDataPrayerAlarm>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LocalDataPrayerAlarm _item;
            final int _tmpIndex;
            _tmpIndex = _cursor.getInt(_cursorIndexOfIndex);
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final boolean _tmpIsReminded;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsReminded);
            _tmpIsReminded = _tmp != 0;
            _item = new LocalDataPrayerAlarm(_tmpIndex,_tmpTime,_tmpIsReminded);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
