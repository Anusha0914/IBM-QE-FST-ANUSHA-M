a=input("Enter your choice player a:")
b=input("Enter your choice player b:")

if a==b:
    print("tie")
elif a=='rock':
    if b=='scissors':
        print("a wins")
    else:
        print("b wins")
elif a=='scissors':
    if b=='rock':
        print("b wins")
    else:
        print("a wins")

elif a =='paper':
     if b=='rock':
         print("a wins")
     else:
         print("b wins")

else:
    print("invalid input")
