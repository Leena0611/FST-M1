import math
import pytest
import math
@pytest.mark.great
def testSum():
    num1=22
    num2=22
    sum=44
    assert sum==num1+num2

@pytest.mark.great
def testDiff():
    num1=50
    num2=23
    assert 25 == num1-num2
@pytest.mark.others
def testprod():
    a=7
    b=8
    assert 56==a*b

def testQuotient():
    a=99
    b=9
    assert 10==a/b

