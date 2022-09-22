package org.example.builder;

class DesktopUser{
    //concrete class
    private String name;
    public DesktopUser(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static DesktopUserBuilder getBuilder(){
        return new DesktopUserBuilder();
    }
    public static  class DesktopUserBuilder{
        //Builder for concrete class
        private String name;
        public DesktopUserBuilder name(String name){
            this.name = name;
            return this;
        }

        public DesktopUser build(){
            return new DesktopUser(name);
        }

    }
}


