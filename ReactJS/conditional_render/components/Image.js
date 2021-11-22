import React from "react";

const Image = (props) => {
  return (
    <div className="col col-lg-3">
      <div className="card">
        <img className="card-img-top" src={props.data.thumbnailUrl} alt="Card image cap" />
        <div className="card-body">
          <h5 className="card-title">{props.data.title}</h5>
          <a className = "btn btn-primary" href = {props.data.url} target = "blank">View Full Image</a>
        </div>
      </div>
    </div>
  );
};

export default Image;
