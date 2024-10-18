# Function

## Definition

Function is a block of code that performs a specific task.
If we perform a task multiple times in program, instead of duplicate code,
we can create a function and call it multiple times.

## Category

1. Built-in Function: the functions that are built into the programming language.
2. User-defined Function: the functions that are created by the programmer.

## Structure

1. **Name**: The name of the function.
2. **Parameters**: The parameters also called arguments are the values that are passed to the function.
3. **Return**: The return type is the data type of the value that the function returns.
4. **Body**: The body of the function is the code that is executed when the function is called.

### Example
```java
public int add(int x, int y) {
    return x + y;
}
```
- Name: `add`
- Parameters: `int x`, `int y`
- Return: `int`
- Body: `return x + y`

## Type

1. Function without Parameters and Return Value
   - Function without Parameters and return value. 
    ```java
    private void printHello() {
        System.out.println("Hello");
    }
    ```
2. Function with one-way I/O
   - Function without Parameters but return value
    ```java
    private int getAge() {
        return 20;
    }
    ```
   - Function with Parameters but without return value
    ```java
    private void setAge(int age) {
        return this.age = age;
    }
    ```
3. Function with two-way I/O
   - Function with Parameters but without return value
    ```java
    private int calculate(int x, int y) {
        return x + y;
    }
    ```

## Parameters

1. Pass by Value: When a method is called, the caller passes a copy of the argument variables to the method resulting in two values in memory.
2. Pass by Reference: When a method is called, the method arguments reference the same variable in memory as the caller.

## Accessibility

1. Global variable: The variable declared outside the function, can use in any function.
2. Local variable: The variable declared inside the function, can use only in that function.
