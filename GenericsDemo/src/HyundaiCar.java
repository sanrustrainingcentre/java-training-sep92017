
public class HyundaiCar extends Car<HyundaiEngine> {

	@Override
	void setEngine(HyundaiEngine engine) {
		super.engine = engine;
	}
	
	Engine getEngine() {
		return (new HyundaiEngine());
	}
	
	

}
