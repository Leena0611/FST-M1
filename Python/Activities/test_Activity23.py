import pytest

def test_assertSum(input_list):
    sum =0
    for n in input_list:
        sum = sum + int(n)
    
    assert sum ==55