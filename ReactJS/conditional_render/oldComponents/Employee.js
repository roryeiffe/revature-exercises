import React, {useState} from "react";

const Employee = () => {
    const [employee, setEmployee] = useState({id: 1, name: 'Mark', email: 'm@gmail.com'});

    return(
        <div>
            <h1>Id: {employee.id}</h1>
            <h1>Name: {employee.name}</h1>
            <h1>Email: {employee.email}</h1>
        </div>
    )


}

export default Employee;