'''
for i in range(1,21,2):
    print(i,end=' ');

print("-------------")

start=int(input("Enter start number "))
myrange=int(input("Enter myrange number "))
increment=int(input("Enter increment number"))

for i in range(start,myrange,increment):
    print(i);
'''
print("--------------")

for i in range(20):
    if(i%2!=0):
        print("even : ",i)
