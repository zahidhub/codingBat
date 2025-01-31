# We have two monkeys, a and b, and the parameters a_smile and b_smile indicate if each is smiling.
# We are in trouble if they are both smiling or if neither of them is smiling. Return True if we are in trouble.

# monkey_trouble(True, True) → True
# monkey_trouble(False, False) → True
# monkey_trouble(True, False) → False

class MonkeyTrouble:

    def monkey_trouble(a_smile, b_smile): #method with boolean parameters
        if a_smile and b_smile: # check if both of them are smiling
            return True
        elif not a_smile and not b_smile: # check if none of them are smiling
            return True
        else:
            return False # otherwise return false

    print(monkey_trouble(False, True)) #print statement to see if wee are in trouble

