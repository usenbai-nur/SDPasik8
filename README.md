# Assignment 8

## Project Overview

This application implements the Visitor pattern to separate service operations from the car part objects. It provides an interactive menu system for servicing car parts and calculating service costs.

##  Design Pattern: Visitor Pattern

The Visitor pattern allows you to add new operations to existing object structures without modifying those structures. In this project:
- **Elements (Car Parts)**: Engine, Wheel, Body, Brake
- **Visitors**: ServiceVisitor, PriceVisitor

## Project Structure

```
src/
├── model/
│   ├── Car.java              # Interface for all car parts
│   ├── Engine.java           # Engine component
│   ├── Wheel.java            # Wheel component
│   ├── Body.java             # Body component
│   └── Brake.java            # Brake component
├── visitor/
│   ├── CarVisitor.java       # Visitor interface
│   ├── ServiceVisitor.java   # Performs service operations
│   └── PriceVisitor.java     # Calculates service costs
└── Main.java                 # Application entry point
```

##  Components

### Model Package
- **Car Interface**: Base interface for all car parts with `accept()` and `getName()` methods
- **Concrete Parts**: Engine, Wheel, Body, Brake - each implements the Car interface

### Visitor Package
- **CarVisitor Interface**: Defines visit methods for each car part type
- **ServiceVisitor**: Implements service operations (checking oil, tire pressure, etc.)
- **PriceVisitor**: Calculates and tracks service costs for each part

## Service Costs

| Part   | Service Cost |
|--------|-------------|
| Engine | 25,000      |
| Wheel  | 2,000       |
| Body   | 15,000      |
| Brake  | 20,000      |
| **Total** | **62,000** |

##  Usage

When you run the application, you'll see an interactive menu:

```
Welcome to CTO
1) Perform serving
2) Calculate total service cost
3) Service Specific part
4) exit
choose:
```

### Menu Options

**Option 1: Perform Full Service**
- Services all car parts (Engine, Wheel, Body, Brake)
- Displays service operations for each part

**Option 2: Calculate Total Service Cost**
- Calculates the cost for servicing all parts
- Displays individual costs and total

**Option 3: Service Specific Part**
- Select a specific car part
- Choose to either service it or calculate its cost

**Option 4: Exit**
- Exits the application

## Example Output

```
Welcome to CTO
1) Perform serving
2) Calculate total service cost
3) Service Specific part
4) exit
choose: 1

--- Performing Full Service ---
checking engine oil
checking tire pressure
cleaning car body
checking brake pads
```

```
choose: 2

--- Calculating Service Cost ---
Engine serve cost: 25000
Wheel serve cost: 2000
Body serve cost: 15000
Brake serve cot: 20000

Total Service Cost: 62000.0
```
