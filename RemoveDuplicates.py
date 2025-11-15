#CORRECT APPROACH

def remove_duplicates(input_list):

    if not input_list:                        #if list is empty
        return 0

    i=1                                      #pointer for next unique element position. Element at 0 is always unique
    for j in range(1,len(input_list)):         
        if input_list[j] != input_list[j-1]:        #i.e if current element is unique
            input_list[i] = input_list[j]           #move unique element to the front
            i+=1

    return i                                   #return count of unique elements 

    


    
            

