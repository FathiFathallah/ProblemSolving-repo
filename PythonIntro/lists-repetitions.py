#delete repetitions in list

my_list = [1, 2, 4, 4, 1, 4, 2, 6, 2, 9]
new_list = []

for index in range(len(my_list)):
    if my_list[index] not in new_list:
        new_list.append(my_list[index])
    else:
        continue

my_list = new_list[:]
print("The list with unique elements only:")
print(my_list)
