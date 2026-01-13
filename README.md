# Battleships-LSBU

## Overview
Java-based Battleship game developed as part of university coursework. The project uses a multi-class, object-oriented design with both CLI and GUI components. It demonstrates modular architecture, strategy pattern implementation, and exception handling.

## Features
- Multi-class Java structure  
- CLI and GUI gameplay modes  
- Randomized ship placement  
- Turn-based hit/miss logic  
- Fleet management and board rendering  
- Strategy pattern for computer players  
- Custom exceptions for ship placement errors  

## How to Run
Compile all Java files inside `src`:
javac src/*.java

Run the CLI launcher:
java src.CLIGameLauncher

## Class Overview
- CLIGameLauncher – Entry point for CLI mode  
- CLIGame – Controls CLI gameplay  
- CLIHumanPlayer / CLIComputerPlayer – Player logic  
- Board – Grid management, hit/miss checks, ship placement  
- Fleet – Manages all ships for a player  
- Ship subclasses (Battleship, Destroyer, AircraftCarrier, etc.) – Ship definitions  
- BasicStrategy / BetterStrategy / BestStrategy – AI behaviour  
- BoardPanel / BoardButton – GUI components  
- FailedToPlaceShipException – Custom error handling  

## What I Learned
- Applying OOP principles in a multi-class Java project  
- Implementing strategy patterns for AI behaviour  
- Designing both CLI and GUI interfaces  
- Managing game state and user input  
- Handling exceptions and edge cases  
- Structuring a large Java project cleanly  

## Future Improvements
- Add difficulty levels and improved AI  
- Enhance GUI layout and responsiveness  
- Add sound effects or animations  
- Add unit tests for core components  
- Refactor for scalability and maintainability
