'''OLD ALGORITHM-
1) IDENTIFY DUPLICATES IN THE LIST.
2) DETECT UNIQUE ELEMENTS IN THE LIST USING A DIFFERENT FUNCTION.
3) RETURN THE INDEX OF THE UNIQUE ELEMENT.
4) SWAP A DUPLICATE WITH A UNIQUE ELEMENT.
5) RETURN THE MODIFIED LIST.
PROBLEMS: AFTER SWAPPING IS DONE, LATER COMPARISIONS ARE MADE WITH THE SWAPPED ELEMENTS, WHICH MAY LEAD TO INCORRECT RESULTS. WE ONLY NEED TO COMPARE THE ORIGINAL ELEMENTS.'''

def remove_duplicates(input_list):
    count=0
    i = 1  # Start from the second element because first element is always unique

    while i < len(input_list):
        
        if input_list[i]==input_list[i-1]:
            next_index = find_unique(input_list, i)
            if next_index is not None:
                input_list[i], input_list[next_index] = input_list[next_index], input_list[i]
                count+=1
            else:
                break
        i += 1


    return len(input_list)-count

def find_unique(input_list,index):
    for j in range(index+1,len(input_list)):
        if input_list[j]!=input_list[index]:
            return j
        
    return None


    
            

