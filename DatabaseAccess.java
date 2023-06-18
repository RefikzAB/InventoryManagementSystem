public class DatabaseAccess {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public Shoe searchForShoe(Shoe shoe) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Execute SQL query to search for the shoe in the database
            String query = "SELECT * FROM shoes WHERE brand = ? AND model = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, shoe.getBrand());
            statement.setString(2, shoe.getModel());

            ResultSet resultSet = statement.executeQuery();

            // If a matching shoe is found, create a Shoe object and return it
            if (resultSet.next()) {
                Shoe foundShoe = new Shoe();
                foundShoe.setBrand(resultSet.getString("brand"));
                foundShoe.setModel(resultSet.getString("model"));
                foundShoe.setColor(resultSet.getString("color"));
                foundShoe.setSize(resultSet.getInt("size"));
                foundShoe.setPrice(resultSet.getDouble("price"));
                foundShoe.setCondition(resultSet.getString("condition"));
                return foundShoe;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Return null if no matching shoe is found
    }
}
