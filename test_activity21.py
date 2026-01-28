import pytest
import math

def test_sum():
    a=int(5)
    b=int(6)
    sum = int(a+b)
    assert sum == 11

def test_difference():
    a=int(5)
    b=int(6)
    difference=int(b-a)
    assert difference == 1

def test_product():
    a=int(5)
    b=int(6)
    product=int(a*b)
    assert product == 30

def test_quotient():
    a=int(30)
    b=int(5)
    quotient= int(a/b)
    assert quotient ==6



