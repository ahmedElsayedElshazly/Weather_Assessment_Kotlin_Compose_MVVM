package com.planradar.weatherassessment.core.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.planradar.weatherassessment.cities.data.CitiesDao;
import com.planradar.weatherassessment.cities.data.CitiesDao_Impl;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao;
import com.planradar.weatherassessment.weather.data.dao.WeatherHistoryDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile CitiesDao _citiesDao;

  private volatile WeatherHistoryDao _weatherHistoryDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `cities` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_cities_name` ON `cities` (`name`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `weather_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cityName` TEXT NOT NULL, `description` TEXT NOT NULL, `temperature` REAL NOT NULL, `humidity` INTEGER NOT NULL, `windSpeed` REAL NOT NULL, `iconId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7b3d8a4b8211c9331298ae4dd177b23a')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `cities`");
        db.execSQL("DROP TABLE IF EXISTS `weather_history`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsCities = new HashMap<String, TableInfo.Column>(2);
        _columnsCities.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCities = new HashSet<TableInfo.Index>(1);
        _indicesCities.add(new TableInfo.Index("index_cities_name", true, Arrays.asList("name"), Arrays.asList("ASC")));
        final TableInfo _infoCities = new TableInfo("cities", _columnsCities, _foreignKeysCities, _indicesCities);
        final TableInfo _existingCities = TableInfo.read(db, "cities");
        if (!_infoCities.equals(_existingCities)) {
          return new RoomOpenHelper.ValidationResult(false, "cities(com.planradar.weatherassessment.cities.data.model.CityEntity).\n"
                  + " Expected:\n" + _infoCities + "\n"
                  + " Found:\n" + _existingCities);
        }
        final HashMap<String, TableInfo.Column> _columnsWeatherHistory = new HashMap<String, TableInfo.Column>(8);
        _columnsWeatherHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("cityName", new TableInfo.Column("cityName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("temperature", new TableInfo.Column("temperature", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("windSpeed", new TableInfo.Column("windSpeed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("iconId", new TableInfo.Column("iconId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherHistory.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherHistory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherHistory = new TableInfo("weather_history", _columnsWeatherHistory, _foreignKeysWeatherHistory, _indicesWeatherHistory);
        final TableInfo _existingWeatherHistory = TableInfo.read(db, "weather_history");
        if (!_infoWeatherHistory.equals(_existingWeatherHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "weather_history(com.planradar.weatherassessment.weather.data.model.WeatherHistoryEntity).\n"
                  + " Expected:\n" + _infoWeatherHistory + "\n"
                  + " Found:\n" + _existingWeatherHistory);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7b3d8a4b8211c9331298ae4dd177b23a", "31ce9e30489c71b52c30a46d852c2489");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "cities","weather_history");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cities`");
      _db.execSQL("DELETE FROM `weather_history`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CitiesDao.class, CitiesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WeatherHistoryDao.class, WeatherHistoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CitiesDao citiesDao() {
    if (_citiesDao != null) {
      return _citiesDao;
    } else {
      synchronized(this) {
        if(_citiesDao == null) {
          _citiesDao = new CitiesDao_Impl(this);
        }
        return _citiesDao;
      }
    }
  }

  @Override
  public WeatherHistoryDao weatherHistoryDao() {
    if (_weatherHistoryDao != null) {
      return _weatherHistoryDao;
    } else {
      synchronized(this) {
        if(_weatherHistoryDao == null) {
          _weatherHistoryDao = new WeatherHistoryDao_Impl(this);
        }
        return _weatherHistoryDao;
      }
    }
  }
}
