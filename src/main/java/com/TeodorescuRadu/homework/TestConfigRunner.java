public class TestConfigRunner {
    public static void main(String[] args) {

        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX, "125.0", true);

        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "123.0");

        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME);

        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        config4.afiseazaConfig();
    }
}

