
public abstract class Car<T extends Engine> {
	
	protected T engine;
	
	void setEngine(T engine) {
		this.engine = engine;
	}
	
	Engine getEngine() {
		return engine;
	}

}
