package com.stackroute.Pe2;

public class MemberInformation {
    private class Member {
        Member() {
        }


        Member(String name, int age, double salary) {
            setName(name);
            setAge(age);
            setSalary(salary);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        private String name;
        private Integer age;
        private Double salary;
    }

    Member member = null;

    /**
     * Used to create a Member
     *
     * @param name   Name of the member
     * @param age    Age of the member
     * @param salary Salary of the member
     */
    public void memberNameCreate(String name, int age, double salary) {
        member = new Member(name, age, salary);
    }


    public String getMemberName() {
        return (member != null) ? member.getName() : null;
    }


    public int getMemberAge() {
        return (member != null) ? member.getAge() : null;
    }


    public double getMemberSalary() {
        return (member != null) ? member.getSalary() : null;
    }
}
