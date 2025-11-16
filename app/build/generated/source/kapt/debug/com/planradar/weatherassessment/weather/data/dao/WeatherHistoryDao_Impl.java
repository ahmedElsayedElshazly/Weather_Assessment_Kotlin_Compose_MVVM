package com.planradar.weatherassessment.weather.data.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity;
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
public final class WeatherHistoryDao_Impl implements WeatherHistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherHistoryEntity> __insertionAdapterOfWeatherHistoryEntity;

  public WeatherHistoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherHistoryEntity = new EntityInsertionAdapter<WeatherHistoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `weather_history` (`id`,`cityName`,`description`,`temperature`,`humidity`,`windSpeed`,`iconId`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WeatherHistoryEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getCityName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCityName());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        statement.bindDouble(4, entity.getTemperature());
        statement.bindLong(5, entity.getHumidity());
        statement.bindDouble(6, entity.getWindSpeed());
        if (entity.getIconId() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getIconId());
        }
        statement.bindLong(8, entity.getTimestamp());
      }
    };
  }

  @Override
  public Object insertWeatherHistory(final WeatherHistoryEntity weatherHistory,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWeatherHistoryEntity.insert(weatherHistory);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<WeatherHistoryEntity>> getWeatherHistoryByCity(final String cityName) {
    final String _sql = "SELECT * FROM weather_history WHERE cityName = ? ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (cityName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, cityName);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"weather_history"}, new Callable<List<WeatherHistoryEntity>>() {
      @Override
      @NonNull
      public List<WeatherHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windSpeed");
          final int _cursorIndexOfIconId = CursorUtil.getColumnIndexOrThrow(_cursor, "iconId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<WeatherHistoryEntity> _result = new ArrayList<WeatherHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WeatherHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCityName;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCityName = null;
            } else {
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final int _tmpHumidity;
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpIconId;
            if (_cursor.isNull(_cursorIndexOfIconId)) {
              _tmpIconId = null;
            } else {
              _tmpIconId = _cursor.getString(_cursorIndexOfIconId);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new WeatherHistoryEntity(_tmpId,_tmpCityName,_tmpDescription,_tmpTemperature,_tmpHumidity,_tmpWindSpeed,_tmpIconId,_tmpTimestamp);
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

  @Override
  public Object getWeatherHistoryById(final long id,
      final Continuation<? super WeatherHistoryEntity> $completion) {
    final String _sql = "SELECT * FROM weather_history WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<WeatherHistoryEntity>() {
      @Override
      @Nullable
      public WeatherHistoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windSpeed");
          final int _cursorIndexOfIconId = CursorUtil.getColumnIndexOrThrow(_cursor, "iconId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final WeatherHistoryEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCityName;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCityName = null;
            } else {
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final int _tmpHumidity;
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpIconId;
            if (_cursor.isNull(_cursorIndexOfIconId)) {
              _tmpIconId = null;
            } else {
              _tmpIconId = _cursor.getString(_cursorIndexOfIconId);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _result = new WeatherHistoryEntity(_tmpId,_tmpCityName,_tmpDescription,_tmpTemperature,_tmpHumidity,_tmpWindSpeed,_tmpIconId,_tmpTimestamp);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<WeatherHistoryEntity>> getAllWeatherHistory() {
    final String _sql = "SELECT * FROM weather_history ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"weather_history"}, new Callable<List<WeatherHistoryEntity>>() {
      @Override
      @NonNull
      public List<WeatherHistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "cityName");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "windSpeed");
          final int _cursorIndexOfIconId = CursorUtil.getColumnIndexOrThrow(_cursor, "iconId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<WeatherHistoryEntity> _result = new ArrayList<WeatherHistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WeatherHistoryEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCityName;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCityName = null;
            } else {
              _tmpCityName = _cursor.getString(_cursorIndexOfCityName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final int _tmpHumidity;
            _tmpHumidity = _cursor.getInt(_cursorIndexOfHumidity);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final String _tmpIconId;
            if (_cursor.isNull(_cursorIndexOfIconId)) {
              _tmpIconId = null;
            } else {
              _tmpIconId = _cursor.getString(_cursorIndexOfIconId);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new WeatherHistoryEntity(_tmpId,_tmpCityName,_tmpDescription,_tmpTemperature,_tmpHumidity,_tmpWindSpeed,_tmpIconId,_tmpTimestamp);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
