
'''
Rock beats scissors
Scissors beats paper
Paper beats rock
'''
i=1
while( i>0):
    player1 = input("Selects from Rock, paper, scissors: ")
    player2 = input("Selects from Rock, paper, scissors: ")
    if player1 == player2:
        print("Its a tie")
    elif player1=='rock' :
        if player2=='scissors':
            print("Player1 beats player2. Rock wins!!")
        elif player2 =='paper':
            print("player2 beats player1. Paper wins!!")
        else:
            print("Invalid input, please enter rock, paper, scissors") 
    elif player1=='scissors':
        if player2=='rock':
            print("Player2 beats player1. Rock Wins!!")
        elif player2 =='paper':
            print("player1 beats player2. Scissors Wins!!")
        else:
            print("Invalid input, please enter rock, paper, scissors")
    elif player1=='paper':
        if player2=='rock':
            print("Player1 beats player2. Paper Wins!!")
        elif player2 =='scissors':
            print("player2 beats player1. Scissors Wins!!") 
        else:
            print("Invalid input, please enter rock, paper, scissors")
    else:
        print("Invalid input, please enter rock, paper, scissors")
        #raise SystemExit
    
    j = input("Want to play again?? Y/N: ")
    if j=='Y':
        i=2
    elif j=='N':
        i=-1
        raise SystemExit
    else:
        print("Invalid input, please enter rock, paper, scissors")
        raise SystemExit


