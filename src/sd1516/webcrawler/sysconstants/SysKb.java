package sd1516.webcrawler.sysconstants;

public class SysKb {

	public static final String PLATFORM = "WebCrawlerPlatform";
	
	public static final String T4J = "it.unibo.tucson.jade.service.TucsonService";
	public static final String TUCSON_TC_NAME = "default";
	public static final int TUCSON_PORT = 20504;
	public static final int TUCSON_TIMEOUT = 10000;
	public static final int JADE_PORT = 1099;
	public static final String TUCSON_SERVICE_EXCEPTION_MSG = ">>> No TuCSoN service active, reboot JADE with -services " + T4J + " option <<<";
	public static final String TUCSON_INVALID_AGENT_ID_EXCEPTION_MSG = ">>> TuCSoN Agent ids should be compliant with Prolog sytnax (start with lowercase letter, no special symbols), choose another agent id <<<";
	public static final String TUCSON_OPERATION_NOT_POSSIBLE_EXCEPTION_MSG = ">>> TuCSoN Node cannot be installed, check if given port is already in use <<<";	
	
	public static final String WATCHDOG_AGENT = "sd1516.webcrawler.agents.WatchdogAgent";
	public static final String PING_AGENT = "sd1516.webcrawler.agents.PingAgent";
	public static final String MANAGER_AGENT = "sd1516.webcrawler.agents.ManagerAgent";
	public static final String MASTER_AGENT = "sd1516.webcrawler.agents.MasterAgent";
	public static final String WORKER_AGENT = "sd1516.webcrawler.agents.WorkerAgent";
	
	public static final String RASPI_CONT_NAME = "RaspiContainer";
	public static final String RASPI_NAME = "raspi";
	public static final String WATCHDOG_NAME = "watchdog";
	public static final String PING_NAME = "ping";
	public static final String MANAGER_NAME = "manager";
	public static final String MASTER_NAME = "master";
	public static final String WORKER_NAME = "worker";

	public static final String APICE_HOME = "http://test2.apice.unibo.it/xwiki/bin/view/Publications/";
	public static final int APICE_STARTING_YEAR = 1980;
}
