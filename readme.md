Project 3

Photos show all examples as outlined in the design documentation of managing products, customers and purchases. These include the different user types (admin, manager, cashier and customer) and their different functional options.
For example, only an admin can add users to the system. Thus, we do not need to check that a customer isnt making an account with more privliges. 
** A cashier can add or edit a customer into the system so that they can then make a purchas.
This version of the project also adds abilities like reviewing old purchases. A Manager can view a complete sales report while a customer can view a report of their own purchases only.

Please also note that although only admin can add a new user and they may update user info, each user can update their full name and their password by loging in and selecting Update Profile. The systme does not let them change any other atribute. 

Load allows the user to enter an exsisting id and load the coresponding atributes.  If the id does not exsist, the system will display a warning message. This option is available in the manage sections such as managing a product or purchase.
** A cashier can update a purchase, but only the price and quantity.

If the user enters all the required values and selects update, the system will either update the values choresponding to an exsisting id 
or if the id does not exsist, it will add it to the table. 

This system has a lot of error handeling.
If a non-exsistig user tries to log in, or enters an incorrect password, an error message will appear, blocking them from acessing the system (see test folder for example of this error checking)

Other error checking includes but is not limited to catching if a user enters an incorrect atribute type, they try to add to the database with an exsisting ID, they try to load something with an invalid Id, etc.

The design document also includes basic edge cases that outline what would occur if some of the above errors occur. 
