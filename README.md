# 🌤️ Weather Assessment - Kotlin Compose MVVM

An Android app that displays current weather information and weather history for cities using the OpenWeatherMap API. Built with Kotlin, Clean Architecture, Jetpack Compose, and modern Android libraries.

---

## ✨ Features

- 🌍 View weather information for multiple cities
- ➕ Add and manage cities
- 📊 View weather history for each city
- 💾 Offline caching with Room Database
- 🔄 Real-time weather updates
- 🎨 Modern UI with Jetpack Compose
- 📱 Material Design 3

---

## 🧱 Architecture

Follows Clean Architecture with MVVM pattern:

```
presentation/
    - Screens, ViewModels, UI Components

domain/
    - UseCases, Repository interfaces, Domain models

data/
    - Retrofit, Room, RepositoryImpl, DataSources
```

**Layers:**
- **Presentation:** UI (Compose), ViewModels, Screens
- **Domain:** Business logic, UseCases, Repository interfaces
- **Data:** API + Database + RepositoryImpl

---

## 🛠️ Tech Stack

- **Kotlin**
- **MVVM + Clean Architecture**
- **Jetpack Compose** (UI)
- **Hilt** (Dependency Injection)
- **Retrofit + OkHttp** (Networking)
- **Room Database** (Local Storage)
- **Kotlin Coroutines + Flow** (Asynchronous)
- **Coil** (Image Loading)
- **Navigation Compose** (Navigation)

---

## 🚀 Getting Started

 Add your OpenWeatherMap API key

In `app/build.gradle.kts`, find the `buildConfigField` section:

```kotlin
buildConfigField("String", "API_KEY", "\"YOUR_API_KEY_HERE\"")
```

Replace `YOUR_API_KEY_HERE` with your OpenWeatherMap API key.

**Note:** The app also uses these build config fields:
- `BASE_URL`: OpenWeatherMap API base URL
- `WEATHER_ICON_BASE_URL`: Weather icon images base URL

---

## 📦 Project Structure

```
app/src/main/java/com/planradar/weatherassessment/
├── cities/                    # Cities feature
│   ├── data/                 # Data layer
│   │   ├── CitiesDao.kt
│   │   ├── datasource/
│   │   ├── mapper/
│   │   ├── model/
│   │   └── repository/
│   ├── domain/               # Domain layer
│   │   ├── model/
│   │   ├── repository/
│   │   └── usecase/
│   └── presentation/         # Presentation layer
│       ├── screen/
│       ├── ui/
│       └── viewmodel/
│
├── weather/                  # Weather feature
│   ├── data/
│   ├── domain/
│   └── presentation/
│
└── core/                     # Core/shared components
    ├── api/
    ├── db/
    ├── di/
    ├── navigation/
    └── ui/
```

---

## 🧪 Testing

Run unit tests using:

```bash
./gradlew test
```

Tested components:
- `GetCitiesUseCase`
- `AddCityUseCase`
- `DeleteCityUseCase`
- `GetCurrentWeatherUseCase`
- `SaveWeatherHistoryUseCase`
- `GetWeatherHistoryUseCase`
- `GetWeatherHistoryByIdUseCase`

---

## 📄 License

This project is open-source and available under the MIT License.

---

## 👤 Author

**Ahmed El Sayed El Shazly **

- 📧 Email: Ahmededlsayed_1993@hotmail.com
- 📞 Phone: +20 115 534 8462
- 💻 GitHub: [@ahmedElsayedElshazly](https://github.com/ahmedElsayedElshazly)

---

