import pytest

@pytest.fixture
def input_list():
    input = list(range(11))
    return input



@pytest.fixture
def myWalletAmt():
    myWallet = 10
    return myWallet