import React from "react"
import InstaCard from "./InstaCard"
import "./Cards.css"

function Cards() {
  return (
    <div className="insta">
      <h1>Example Builds Some Tun3rs Built Buying From Our Catalog</h1>
      <div className="insta_container">
        <div className="insta_wrapper">
          <ul className="insta_posts">
            <InstaCard
              src="images/Red370z.png"
              text=" Alex's Red 370z part of Tun3r Nation!"
              label="370z"
              path="/catalog"
            />
            <InstaCard
              src="images/pinks13.png"
              text="Hemiji's Pink S13 in front of 7/11! "
              label="S13/S14"
              path="/catalog"
            />
            <InstaCard
              src="images/AE86.png"
              text="Dani's AE86 Build Inspired by Initial D."
              label="AE86"
              path="/catalog"
            />
            <InstaCard
              src="images/ScionTC.png"
              text="Remi's TC Build!"
              label="Scion"
              path="catalog"
            />
            <InstaCard
              src="images/WRX.png"
              text="Subie Gang Where You At?"
              label="WRX"
              path="catalog"
            />
          </ul>
        </div>
      </div>
    </div>
  )
}

export default Cards
