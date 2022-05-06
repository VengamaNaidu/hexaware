print("Enter Marks Obtained in 6 Subjects: ")
print("Enter English Marks :")
English = int(input())
print("Enter Maths Marks :")
Maths = int(input())
print("Enter Telugu Marks :")
Telugu = int(input())
print("Enter Hindi Marks :")
Hindi = int(input())
print("Enter Science Marks :")
Science = int(input())
print("Enter Social Marks :")
Social = int(input())

tot = English+Maths+Telugu+Hindi+Science+Social
print("Total Marks :",tot)
avg = tot/6
print("average Marks :", avg)

if avg>=91 and avg<=100:
    print("Your Grade is S")
elif avg>=81 and avg<91:
    print("Your Grade is A")
elif avg>=71 and avg<81:
    print("Your Grade is B")
elif avg>=61 and avg<71:
    print("Your Grade is C")
elif avg>=51 and avg<61:
    print("Your Grade is D")
elif avg>=40 and avg<51:
    print("Your Grade is E")
else:
    print("Invalid Input!")
