package MapPackage;

class User {
    String username;

    User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "MapPackage.User: " + username;
    }
}
