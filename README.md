# Native Apps Collection 🚀

A collection of Java console applications demonstrating core programming concepts and practical utilities.

## Projects Overview

### 1. 🎲 Dice Rolling Simulator
**Location:** `src/com/Ezzeldien/Dice/`

A fun interactive dice rolling simulator that displays ASCII art representations of dice faces.

**Features:**
- Roll multiple dice in one session
- ASCII art visualization of each roll (1-6 faces)
- Input validation with error handling
- Interactive user prompts

**How to Run:**
```bash
javac src/com/Ezzeldien/Dice/Simulator.java
java -cp src com.Ezzeldien.Dice.Simulator
```

**Example:**
```
Welcome to Dice Simulator, How many times you want to roll?
3
---------
|   o   |
|       |
---------
```

---

### 2. 📁 File Manager
**Location:** `src/com/Ezzeldien/FileManager/`

A text-based file management utility for listing, creating, and deleting files and directories.

**Features:**
- List files in a directory
- Create new directories
- Delete files or directories
- Event-driven architecture with observer pattern
- Text-based user interface

**Components:**
- `FileManager.java` - Core file operations
- `TextBasedInterface.java` - User interaction layer
- `UiEventHandler.java` - Event handling interface

**How to Run:**
```bash
javac src/com/Ezzeldien/FileManager/*.java
java -cp src com.Ezzeldien.FileManager.FileApp
```

---

### 3. 🔐 Password Generator
**Location:** `src/com/Ezzeldien/Passwords/`

A customizable password generator that creates secure passwords based on user preferences.

**Features:**
- Configurable password length
- Optional character sets:
  - Lowercase letters
  - Uppercase letters
  - Numbers
  - Special symbols
- Random secure password generation

**Components:**
- `PasswordGenerator.java` - Password generation logic
- `TextBasedInterface.java` - User configuration interface

**How to Run:**
```bash
javac src/com/Ezzeldien/Passwords/*.java
java -cp src com.Ezzeldien.Passwords.App
```

**Example Interaction:**
```
Enter password length: 16
Use lowercase? (y/n): y
Use uppercase? (y/n): y
Use numbers? (y/n): y
Use symbols? (y/n): y
Generated Password: aB3$xK9@mL2#pQ5!
```

---

### 4. 🎮 Word Guessing Game
**Location:** `src/com/Ezzeldien/WordGame/`

An interactive word guessing game where players try to guess hidden words with limited attempts.

**Features:**
- Multiple rounds (default: 3 words to guess)
- 10 attempts per word
- Tracks guessed words across rounds
- Displays progress and final score

**Components:**
- `wordGuessingGame.java` - Game logic and mechanics
- `App.java` - Game orchestration

**How to Run:**
```bash
javac src/com/Ezzeldien/WordGame/*.java
java -cp src com.Ezzeldien.WordGame.App
```

**Example:**
```
Guess the word: _ _ _ _ _
Attempts remaining: 10
Guess a letter: a
```

---

### 5. 🌤️ Weather Forecast App
**Location:** `src/com/Ezzeldien/WeatherForecastApp/`

*Currently in development* - A weather forecasting application using external weather APIs.

**Components:**
- `WeatherApi.java` - API integration
- `env.java` - Environment configuration

**Note:** Requires API key configuration in `env.java`

---

## Project Structure

```
Native_Apps/
├── src/
│   └── com/
│       └── Ezzeldien/
│           ├── Dice/
│           ├── FileManager/
│           ├── Passwords/
│           ├── WeatherForecastApp/
│           └── WordGame/
├── out/                    (compiled classes)
├── .idea/                  (IDE configuration)
└── README.md
```

## Requirements

- **Java 16+** (uses switch expressions)
- No external dependencies required for most projects

## Getting Started

1. **Clone or download** the repository
2. **Navigate** to the project directory
3. **Compile** the desired project:
   ```bash
   javac src/com/Ezzeldien/<ProjectName>/*.java
   ```
4. **Run** the application:
   ```bash
   java -cp src com.Ezzeldien.<ProjectName>.<MainClass>
   ```

## Key Concepts Demonstrated

- ✅ Object-Oriented Programming (OOP)
- ✅ Design Patterns (Observer, Event-driven)
- ✅ Exception Handling
- ✅ Collections (ArrayList, Arrays)
- ✅ File I/O Operations
- ✅ Random Number Generation
- ✅ String Manipulation
- ✅ User Input Validation

## Author

**Ezzeldien M. Abdalaziz**

## License

This project is open source and available for educational purposes.

---

**Happy Coding! 💻**
