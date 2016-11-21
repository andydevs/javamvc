# JavaMVC

This is a simple program written in Java that demonstrates the Model-View-Controller (MVC) application design pattern.

## The App

The app is a very basic integer calculator. The inputs are entered in the two text fields, with the order of operation going from left to right. The operation is selected from the drop down menu, and is executed with the "execute" button. The output is then displayed to the right of the execute button.

## Model View Controller Design Pattern

This application is designed using the Model-View-Controller application design pattern, a common pattern in web application design. The application is made up of three components, addressed below:

### The Model

The model represents the data being processed by the application. The properties and actions that manipulate data are defined entirely in the model. In this program, the model stores the input data and defines the math operations that the calculator can perform on the data.

### The View

The view displays information to the user and handles user input. This is like a dashboard or the control center for the underlying data manipulation and controls. In this app, the view retrieves the input and operation values and displays the output.

### The Controller

The controller handles actions requested by the view. This interfaces between the view and the model and controls what actions can be performed and when. The view calls controller methods, which intern call methods in the model, and this data is returned back to the view to be displayed to the user. In this program, the controller only has one operation: execute, which sets the input and operation in the model and returns the result.