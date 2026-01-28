import pytest

@pytest.fixture
def wa():
   a = 0
   return a


@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wa, earned, spent, expected):
	
    
    wa = wa+ earned

    
    wa = wa-spent


    assert wa == expected