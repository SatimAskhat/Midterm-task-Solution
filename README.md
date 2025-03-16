# Smart Home Control System
## In this project, I developed a smart home control system using several key design patterns. The main goal was to create a convenient way to manage different devices like lights, locks, and sensors.


## 🔧 Design Patterns Used:
**Composite – Allows grouping devices (e.g., a room) and managing them together.
Decorator – Extends device functionality without modifying the original code, such as adding logging.
Abstract Factory – Handles the creation of smart home devices, making it flexible to choose different types.
Facade – Provides a simple interface for controlling all devices at once.
Adapter – Integrates legacy systems (e.g., an old lock) so they work with our smart home setup.**


## 📂 Project Structure:
**Main.java – The entry point of the program.
SmartHomeSystem.java – The main class for managing devices.
Light.java – Class for controlling lights.
Room.java – Implements the Composite pattern, allowing device grouping.
Decorator.java – Base class for decorators.
LoggingDecorator.java – Extends devices by adding logging functionality.
SmartHomeFactory.java – Interface for the factory.
BasicSmartHomeFactory.java – Implements a factory for standard devices.
Adapter.java – Adapts old systems to work with the new architecture.**


## 🎯 What the System Does:
**Allows adding devices to rooms.
Supports extending functionality without modifying existing code.
Works with old devices through an adapter.
Provides an easy way to control all devices via a facade.**

## 📝 Conclusion:
**This project helped me to better understand design patterns and how to apply them in real projects. In this project, I tried to demonstrate my skills and I think it will somehow satisfy your expectations. I tried to make smart home management simple and elegant.**
