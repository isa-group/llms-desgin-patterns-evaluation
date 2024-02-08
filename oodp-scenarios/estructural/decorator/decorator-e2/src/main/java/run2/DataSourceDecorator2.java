package run2;

public abstract class DataSourceDecorator2 implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator2(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
