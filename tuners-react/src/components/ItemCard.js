import React from "react"
import { Link } from "react-router-dom"
import "./ItemCard.css"

function ItemCard(props) {
  return (
    <div
      style={{
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        paddingTop: 15,
        paddingBottom: 15,
        paddingLeft: 15,
        paddingRight: 15,
      }}
    >
      <div className="cards">
        <div className="wrapper">
          <Link to={`/inventory/${props.product.id}`}>
            <img
              style={{
                display: "flex",
                alignItems: "center",
                justifyContent: "center",
              }}
              className="itemImage"
              src={props.product.img}
              alt="Could not fetch"
            ></img>
          </Link>

          <div className="p-3">
            <h3>
              <Link to={`/inventory/${props.product.id}`}>
                {props.product.itemName}
              </Link>
            </h3>
            <div>$ {props.product.price}</div>
            <div>{props.product.description}</div>
            <Link to={`/inventory/${props.product.id}`}>View</Link>
          </div>
        </div>
      </div>
    </div>
  )
}

export default ItemCard
