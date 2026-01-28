import pytest

@pytest.fixture

def n_list():
    n_list=[1,2,3,4,5,6,7,8,9,10]

    return n_list

def test_sum(n_list):
         sum=0
         for i in n_list:
           sum=sum+i

         assert sum==55