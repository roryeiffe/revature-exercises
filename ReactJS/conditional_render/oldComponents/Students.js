import React from 'react';
import Student from "./Student";

const Students = () => {

    const students = [
        {id: 1,name: 'Mark', age : 10, email : 'm@gmail.com'} ,
        {id: 2,name: 'Paul', age : 10, email : 'p@gmail.com'} ,
        {id: 3,name: 'Watson', age : 10, email : 'w@gmail.com'} ,
        {id: 4,name: 'John', age : 10, email : 'm=j@gmail.com'} ,
    ]

    return (<div>
        <h1>Students</h1>
        <table className="table table-bordered">
            <thead className="thead dark">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                {students.map((student) => (
                    <Student data = {student}/>
                ))}
            </tbody>
        </table>
    </div>)
}

export default Students;