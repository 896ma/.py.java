# This program checks whether a number entered by the user is even or not.

# Get the number from the user.
number = int(input("Enter a number: "))

# Check if the number is even.
if number % 2 == 0:
    print("The number is even.")
else:
    print("The number is odd.")