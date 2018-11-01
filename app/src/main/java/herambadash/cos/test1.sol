pragma solidity ^0.4.0;

contract test1 {

    string private name;
    uint private age;

    function setname(string newName) public
    {
        name = newName;
    }

    function getName() public view returns (string)
    {
        return name;
    }

    function setAge(uint newAge) public
    {
        age = newAge;
    }
    function getAge() public view returns (uint)
    {
        return age;
    }
}
