def solution(number, k):
    st = []
    
    num_arr = [int(num) for num in number]
    
    st.append(num_arr[0])
    
    for i in range(1, len(num_arr)):
        while st and k > 0 and st[-1] < int(number[i]):
            st.pop()
            k -= 1
        st.append(int(number[i]))
        
    if k > 0:
        st = st[:-k]
    
    return ''.join(map(str, st))