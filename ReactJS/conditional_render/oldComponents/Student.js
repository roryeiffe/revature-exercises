import React from "react";


const Student = (props) => {
  return (
    <tr>
      <td>{props.data.id}</td>
      <td>{props.data.name}</td>
      <td>{props.data.age}</td>
      <td>{props.data.email}</td>
    </tr>
  );
};

export default Student;
