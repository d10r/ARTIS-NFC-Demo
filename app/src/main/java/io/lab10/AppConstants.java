package io.lab10;

/**
 * Class used for common app constants.
 */
public class AppConstants {

    /**
     * Log tag, used in logcat messages from this app.
     */
    public static final String TAG = "Coinfineon";

    public static final String ASK = "ask";
    private static final String HTTPS = "https://";
    private static final String BASEURL = ".artis.network";
    public static final String MAINNET_URI = HTTPS + "rpc.sigma1" + BASEURL;
    public static final String TESTNET_URI = HTTPS + "rpc.tau1" + BASEURL;;
    private static final String ETHEUR = "ETHEUR";
    private static final String COINFINITY_BASE_URL = "https://coinfinity.co";
    public static final String HTTPS_COINFINITY_CO_PRICE_XBTEUR = COINFINITY_BASE_URL + "/price/" + ETHEUR;
    public static final int TEN_SECONDS = 10;
    public static final int FIVE_SECONDS = 5;
    //if sig counter below this value warning is shown to user
    public static final int WARNING_SIG_COUNTER = 100;

    // can't yet be set to correct value due to https://github.com/web3j/web3j/issues/234
    public static final byte ARTIS_SIGMA1_CHAIN_ID = 1; // 246529;
    public static final byte ARTIS_TAU1_CHAIN_ID = 1; // 246785;

    // preferences
    public static final String PREFERENCE_FILENAME = "CoinfineonPrefs";

    // used for all activities:
    public static final String PREF_KEY_MAIN_NETWORK = "mainNetwork";
    public static final String PREF_KEY_PIN = "pin";
    public static final String KEY_INDEX_OF_CARD = "keyIndexOfCard";

    public static final String DEFAULT_GASPRICE_IN_GIGAWEI = "1";
    public static final String DEFAULT_GASLIMIT = "21000";
    public static final String DEFAULT_ERC20_GASLIMIT = "80000";

    // send eth
    public static final String PREF_KEY_RECIPIENT_ADDRESS = "recipientAddressTxt";
    public static final String PREF_KEY_GASPRICE_WEI = "gasPriceInWei";
    public static final String PREF_KEY_GASLIMIT_SEND_ETH = "gasLimitSendEth";

    // send erc20

    // SPLY token on sigma1
    public static final String DEFAULT_SIGMA1_ERC20_CONTRACT_ADDRESS = "0xE53BA69C94b657838B2b22B9BC609163cC34512f";

    // SFAU token on tau1
    public static final String DEFAULT_TAU1_ERC20_CONTRACT_ADDRESS = "0xF6eF10E21166cf2e33DB070AFfe262F90365e8D4";

    public static final String PREF_KEY_ERC20_CONTRACT_ADDRESS = "erc20ContractAddress";
    public static final String PREF_KEY_ERC20_RECIPIENT_ADDRESS = "erc20RecipientAddress";
    public static final String PREF_KEY_ERC20_AMOUNT = "erc20TokenAmount";
    public static final String PREF_KEY_ERC20_GASLIMIT = "erc20GasLimit";

    // voting
    public static final String PREF_KEY_VOTING_GASLIMIT = "votingGasLimit";
    public static final String PREF_KEY_VOTING_CONTRACT_ADDRESS = "votingContractAddress";
    // https://etherscan.io/address/0x2c680955cd340eae72703e6886957bf8465f9583#code
    public static final String DEFAULT_VOTING_CONTRACT_ADDRESS = "0x2c680955cd340eae72703e6886957bf8465f9583";
    public static final String PREF_KEY_VOTING_CONTRACT_ADDRESS_TESTNET = "votingContractAddressTestnet";
    // https://ropsten.etherscan.io/address/0x104d919b299dbbbea258a41e2e910c29c551bf17#code
    public static final String DEFAULT_VOTING_CONTRACT_ADDRESS_TESTNET = "0x104d919b299dbbbea258a41e2e910c29c551bf17";
}
