hour = int(input("Starting time (hours): "))
mins = int(input("Starting time (minutes): "))
dura = int(input("Event duration (minutes): "))

# Write your code here.
print(str(int(((hour*60 + mins + dura)/60)%24)),end=":")
print((hour*60 + mins + dura)%60)
