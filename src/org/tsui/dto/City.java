package org.tsui.dto;
/**
 * 城市天气状况
 * @author TsuiXh
 *	@since 2017年3月19日
 */
public class City {
	
	private String cityX;		//城市中心坐标X
	private String cityY;		//城市中心坐标Y
	private String cityname;		//城市名
	private String centername;		//中心地区名
	private String pyName;	//下一级查询的地区名（如果没有则没有下一级）
	private String state1;		//天气状态一（对应图片1）
	private String state2;		//天气状态二（对应图片2）
	private String stateDetailed;		//天气详情
	private String tem1;		//最低气温
	private String tem2;		//最高气温
	private String temNow;		//当前温度
	private String windState;		//风力状况
	private String windDir;		//风向
	private String windPower;		//风力
	private String humidity;		//湿度
	private String time;		//更新时间
	private String url;		//详情编码
	
	public City() {
		super();
	}
	/**
	 * 获取城市坐标X
	 * @return 城市中心坐标X
	 */
	public String getCityX() {
		return cityX;
	}
	/**
	 * 设置城市中心坐标X
	 * @param cityX	城市中心坐标X
	 */
	public void setCityX(String cityX) {
		this.cityX = cityX;
	}
	/**
	 * 获取城市中心坐标Y
	 * @return 城市中心坐标Y
	 */
	public String getCityY() {
		return cityY;
	}
	/**
	 * 设置城市中心坐标Y
	 * @param cityY	城市中心坐标Y
	 */
	public void setCityY(String cityY) {
		this.cityY = cityY;
	}
	/**
	 * 获取城市名
	 * @return	城市名称
	 */
	public String getCityname() {
		return cityname;
	}
	/**
	 * 设置城市名称
	 * @param cityname	城市名称
	 */
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	/**
	 * 获取城市中心名称
	 * @return	城市中心名称
	 */
	public String getCentername() {
		return centername;
	}
	/**
	 * 设置城市中心名称
	 * @param centername	城市中心名称
	 */
	public void setCentername(String centername) {
		this.centername = centername;
	}
	/**
	 * 城市拼音名称<br>
	 * <quote>如果返回为NULL，则说明没有下级城市</quote>
	 * @return	城市拼音名称
	 */
	public String getPyName() {
		return pyName;
	}
	/**
	 * 设置成是拼音名称
	 * @param pyName	拼音名称
	 */
	public void setPyName(String pyName) {
		this.pyName = pyName;
	}
	/**
	 * 获取天气状态图1的名称码
	 * @return	天气状态图1的名称码
	 */
	public String getState1() {
		return state1;
	}
	/**
	 * 设置天气状态图1的名称码
	 * @param state1	天气状态图1的名称码
	 */
	public void setState1(String state1) {
		this.state1 = state1;
	}
	/**
	 * 获取天气状态图2的名称码
	 * @return	天气状态图2的名称码
	 */
	public String getState2() {
		return state2;
	}
	/**
	 * 设置天气状态图2的名称码
	 * @param state2	设置天气状态图2的名称码
	 */
	public void setState2(String state2) {
		this.state2 = state2;
	}
	/**
	 * 获取天气状态详情
	 * @return	天气状态详情
	 */
	public String getStateDetailed() {
		return stateDetailed;
	}
	/**
	 * 设置天气状态详情
	 * @param stateDetailed	天气状态详情
	 */
	public void setStateDetailed(String stateDetailed) {
		this.stateDetailed = stateDetailed;
	}
	/**
	 * 获取最低温度
	 * @return	最低温度
	 */
	public String getTem1() {
		return tem1;
	}
	/**
	 * 设置最低温度
	 * @param tem1	最低温度
	 */
	public void setTem1(String tem1) {
		this.tem1 = tem1;
	}
	/**
	 * 获取最高温度
	 * @return	最高温度
	 */
	public String getTem2() {
		return tem2;
	}
	/**
	 * 设置最高温度
	 * @param tem2	最高温度
	 */
	public void setTem2(String tem2) {
		this.tem2 = tem2;
	}
	/**
	 * 获取当前温度
	 * @return	当前温度
	 */
	public String getTemNow() {
		return temNow;
	}
	/**
	 * 设置当前温度
	 * @param temNow	当前温度
	 */
	public void setTemNow(String temNow) {
		this.temNow = temNow;
	}
	/**
	 * 获取风力详情
	 * @return	获取风力详情
	 */
	public String getWindState() {
		return windState;
	}
	/**
	 * 设置风力详情
	 * @param windState		风力详情
	 */
	public void setWindState(String windState) {
		this.windState = windState;
	}
	/**
	 * 获取风向
	 * @return	风向
	 */
	public String getWindDir() {
		return windDir;
	}
	/**
	 * 设置风向
	 * @param windDir	风向
	 */
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	/**
	 * 获取风力
	 * @return	风力
	 */
	public String getWindPower() {
		return windPower;
	}
	/**
	 * 设置风力
	 * @param windPower	风力
	 */
	public void setWindPower(String windPower) {
		this.windPower = windPower;
	}
	/**
	 * 获取湿度
	 * @return	湿度
	 */
	public String getHumidity() {
		return humidity;
	}
	/**
	 * 设置湿度
	 * @param humidity	湿度（例：98%）
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	/**
	 * 获取信息更新时间
	 * @return	更新时间
	 */
	public String getTime() {
		return time;
	}
	/**
	 * 设置更新时间
	 * @param time		时间（例如：22:10）
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * 获取城市url名称码
	 * @return	城市url名称码
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置城市url名称码
	 * @param url	城市url名称码
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}
