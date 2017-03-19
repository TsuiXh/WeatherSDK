package org.tsui.dto;
/**
 * ��������״��
 * @author TsuiXh
 *	@since 2017��3��19��
 */
public class City {
	
	private String cityX;		//������������X
	private String cityY;		//������������Y
	private String cityname;		//������
	private String centername;		//���ĵ�����
	private String pyName;	//��һ����ѯ�ĵ����������û����û����һ����
	private String state1;		//����״̬һ����ӦͼƬ1��
	private String state2;		//����״̬������ӦͼƬ2��
	private String stateDetailed;		//��������
	private String tem1;		//�������
	private String tem2;		//�������
	private String temNow;		//��ǰ�¶�
	private String windState;		//����״��
	private String windDir;		//����
	private String windPower;		//����
	private String humidity;		//ʪ��
	private String time;		//����ʱ��
	private String url;		//�������
	
	public City() {
		super();
	}
	/**
	 * ��ȡ��������X
	 * @return ������������X
	 */
	public String getCityX() {
		return cityX;
	}
	/**
	 * ���ó�����������X
	 * @param cityX	������������X
	 */
	public void setCityX(String cityX) {
		this.cityX = cityX;
	}
	/**
	 * ��ȡ������������Y
	 * @return ������������Y
	 */
	public String getCityY() {
		return cityY;
	}
	/**
	 * ���ó�����������Y
	 * @param cityY	������������Y
	 */
	public void setCityY(String cityY) {
		this.cityY = cityY;
	}
	/**
	 * ��ȡ������
	 * @return	��������
	 */
	public String getCityname() {
		return cityname;
	}
	/**
	 * ���ó�������
	 * @param cityname	��������
	 */
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	/**
	 * ��ȡ������������
	 * @return	������������
	 */
	public String getCentername() {
		return centername;
	}
	/**
	 * ���ó�����������
	 * @param centername	������������
	 */
	public void setCentername(String centername) {
		this.centername = centername;
	}
	/**
	 * ����ƴ������<br>
	 * <quote>�������ΪNULL����˵��û���¼�����</quote>
	 * @return	����ƴ������
	 */
	public String getPyName() {
		return pyName;
	}
	/**
	 * ���ó���ƴ������
	 * @param pyName	ƴ������
	 */
	public void setPyName(String pyName) {
		this.pyName = pyName;
	}
	/**
	 * ��ȡ����״̬ͼ1��������
	 * @return	����״̬ͼ1��������
	 */
	public String getState1() {
		return state1;
	}
	/**
	 * ��������״̬ͼ1��������
	 * @param state1	����״̬ͼ1��������
	 */
	public void setState1(String state1) {
		this.state1 = state1;
	}
	/**
	 * ��ȡ����״̬ͼ2��������
	 * @return	����״̬ͼ2��������
	 */
	public String getState2() {
		return state2;
	}
	/**
	 * ��������״̬ͼ2��������
	 * @param state2	��������״̬ͼ2��������
	 */
	public void setState2(String state2) {
		this.state2 = state2;
	}
	/**
	 * ��ȡ����״̬����
	 * @return	����״̬����
	 */
	public String getStateDetailed() {
		return stateDetailed;
	}
	/**
	 * ��������״̬����
	 * @param stateDetailed	����״̬����
	 */
	public void setStateDetailed(String stateDetailed) {
		this.stateDetailed = stateDetailed;
	}
	/**
	 * ��ȡ����¶�
	 * @return	����¶�
	 */
	public String getTem1() {
		return tem1;
	}
	/**
	 * ��������¶�
	 * @param tem1	����¶�
	 */
	public void setTem1(String tem1) {
		this.tem1 = tem1;
	}
	/**
	 * ��ȡ����¶�
	 * @return	����¶�
	 */
	public String getTem2() {
		return tem2;
	}
	/**
	 * ��������¶�
	 * @param tem2	����¶�
	 */
	public void setTem2(String tem2) {
		this.tem2 = tem2;
	}
	/**
	 * ��ȡ��ǰ�¶�
	 * @return	��ǰ�¶�
	 */
	public String getTemNow() {
		return temNow;
	}
	/**
	 * ���õ�ǰ�¶�
	 * @param temNow	��ǰ�¶�
	 */
	public void setTemNow(String temNow) {
		this.temNow = temNow;
	}
	/**
	 * ��ȡ��������
	 * @return	��ȡ��������
	 */
	public String getWindState() {
		return windState;
	}
	/**
	 * ���÷�������
	 * @param windState		��������
	 */
	public void setWindState(String windState) {
		this.windState = windState;
	}
	/**
	 * ��ȡ����
	 * @return	����
	 */
	public String getWindDir() {
		return windDir;
	}
	/**
	 * ���÷���
	 * @param windDir	����
	 */
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	/**
	 * ��ȡ����
	 * @return	����
	 */
	public String getWindPower() {
		return windPower;
	}
	/**
	 * ���÷���
	 * @param windPower	����
	 */
	public void setWindPower(String windPower) {
		this.windPower = windPower;
	}
	/**
	 * ��ȡʪ��
	 * @return	ʪ��
	 */
	public String getHumidity() {
		return humidity;
	}
	/**
	 * ����ʪ��
	 * @param humidity	ʪ�ȣ�����98%��
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	/**
	 * ��ȡ��Ϣ����ʱ��
	 * @return	����ʱ��
	 */
	public String getTime() {
		return time;
	}
	/**
	 * ���ø���ʱ��
	 * @param time		ʱ�䣨���磺22:10��
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * ��ȡ����url������
	 * @return	����url������
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * ���ó���url������
	 * @param url	����url������
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}
