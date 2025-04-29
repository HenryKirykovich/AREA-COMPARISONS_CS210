
CS 210 – SPRING QUARTER
– ASSIGNMENT 1 –

I ) ( 30 pts. ) - This assignment will acquaint you with the use of parameter passing, return values, if/else blocks, and
user inputs. You will create a program that prompts the user for a set of information, then executes simple algebra on
those values and returns a summary report which includes name and size of each shape and comparison result. Your
program should perform the following:
(line break, 11 pt)
A) Create main method and perform the following actions: (12 points)
• Prompt the user for a first shape(line break, 11 pt)
• Prompt the user for the first shape’s dimensions
• Prompt the user for a second shape. Assume the first and second shape are different shape.(line break, 11 p
• Prompt the user for the second shape’s dimensions
• Call a method and pass the first shape’s dimensions.
• Receive the area of the shape.
• Call a method and pass the second shape’s dimensions.
• Receive the area of the shape.
• Print the area of the first shape. (See log below)
• Print the area of the second shape. (See log below)
• Call a method and pass the first and second shape’s area.
(line break, 11 pt)
B) Create a method to calculate the area of a rectangle (3 points)
• Receive the rectangle’s dimension.
• Calculate the area of the rectangle.
• Return the result.
C) Create a method to calculate the area of a triangle (3 points)
• Receive the triangle’s dimension.
• Calculate the area of the triangle.
• Return the result.
D) Create a method to calculate the area of a circle (3 points)
• Receive the circle’s dimension.
• Calculate the area of the circle.
• Return the result.
E) Create a method to compare the areas of shapes. (3 points)
• Receive the first and second shape’s area from main method.
• Compare the areas and display the comparision result. (see the sample log below)
(line break, 11 pt)
F) ( 6 / 30 pts. ) - As an additional requirement, no method (including main() ) may contain more than 12 lines of
instruction, discounting lines which only contain braces ( “ { “ || “ } ” ), method headers, and comments.
(line break, 11 pt)break, 11 pt)
G) ( -15 pts/penalty ) - Include appropriate program documentation and formatting including: (Refer to practice 5)
1) Your first and last name
2) The date
3) A short description of the program’s function
4) Comments to explain the operation of each method
5) Proper indentation & spaces.
(line break, 11 pt)
II ) A Sample log of execution is as follow (user inputs are in bold and underlined):
Define a first shape 1)rectangle, 2)triangle, 3)circle: 1
Rectangle width: 10.0
Rectangle Height: 50.0
Define a second shape 1)rectangle, 2)triangle, 3)circle: 3
Circle radius: 10.0
Rectangle area: 500.0
Circle area: 314.15
The area of the rectangle seems 1.59 times bigger than the area of the circle.
Note:
1. When printing the result after comparing the size of the shape, you must use the name of the shape (triangle, circle,
etc.). It shouldn't be just "the first shape" and "the second shape". (l
2. Your code should include consistent indentation and functions MUST be limited to those presented in chapters 1 to 4
of the textbook and the lecture notes.
(line break, 11 pt)
III ) Tips:
1 ) The basic equation to calculate the area of a rectangle is Width x Height.
2 ) The basic equation to calculate the area of a triangle is (Base x Height)/2.0
3 ) The basic equation to calculate the area of a circle is (pi) x ( Radius) x ( Radius )
4 ) The value of 3.14159 may be used as a stand-in for “pi”. You may opt to use the Math.PI class.field for a more precise
value of pi if you wish.
