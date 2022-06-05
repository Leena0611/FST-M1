import pytest


@pytest.mark.parametrize("earned,spent,expected", [(30,10,30),(20,2,28)])
def test_transactions(myWalletAmt,earned,spent,expected):
    myWalletAmt = myWalletAmt+earned
    myWalletAmt = myWalletAmt-spent

    assert myWalletAmt == expected