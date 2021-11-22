import React, { useState } from "react";

const Customer = () => {
  const [isLoggedIn, setLoggedIn] = useState(false);

  function logIn() {
      setLoggedIn(true);
  }

  function logOut() {
      setLoggedIn(false);
  }

  // short circuit:
//   return isLoggedIn && <button className = "btn btn-danger">Logout</button>

  // ternary operator:
//   return isLoggedIn ? (
//     <button className="btn btn-danger">Logout</button>
//   ) : (
//     <button className="btn btn-primary">Login</button>
//   );

  // 
  let response;
  if(isLoggedIn){
      response = <button onClick = {logOut}className = "btn btn-danger">Logout</button>
  }
  else{
      response = <button onClick = {logIn} className = "btn btn-primary">Login</button>
  }

  return <div>{response}</div>

  // if(isLoggedIn) {
  //     return <button className="btn btn-danger">Logout</button>
  // } else {
  //     return <button className="btn btn-primary">Login</button>
  // }

  // return (
  //     <div>
  //         <button className="btn btn-primary">Login</button>
  //         <button className="btn btn-danger">Logout</button>
  //     </div>
  // )
};

export default Customer;
