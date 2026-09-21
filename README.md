# AdapterPattern

This project demonstrates the Adapter pattern in a school-management context.

## Scenario

A unified school management application exposes a common interface, `SchoolManagementApp`, which requires a single method:

- `integrateSystem()`

Different school subsystems use incompatible interfaces:

- `AttendanceSystem.markAttendance()`
- `GradingSystem.recordGrades()`
- `LibrarySystem.manageBooks()`

Each system is adapted through a dedicated adapter class so it can plug into the same application interface seamlessly.

## Classes

- `SchoolManagementApp` - target interface
- `AttendanceSystemAdapter` - adapts attendance to the school app
- `GradingSystemAdapter` - adapts grading to the school app
- `LibrarySystemAdapter` - adapts library management to the school app

## Verification

The project includes a focused test class that verifies each adapter triggers the correct underlying system action.
